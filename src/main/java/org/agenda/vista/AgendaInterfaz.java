package org.agenda.vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import org.agenda.controlador.AgendaController;
import org.agenda.modelo.Contactos;

public class AgendaInterfaz extends JFrame {

    private AgendaController agenda;
    private int idUsuarioActual;

    private JTable tablaContactos;
    private DefaultTableModel tableModel;
    private JButton btnAgregar;
    private JButton btnModificar;
    private JButton btnEliminar;

    private final String[] columnas = {"ID", "Nombre", "Apellido", "Correo", "Dirección", "Localidad"};

    public AgendaInterfaz(int idUsuarioActual) {
        super("Gestión de Contactos");
        this.idUsuarioActual = idUsuarioActual;
        agenda = new AgendaController();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        inicializarComponentes();

        cargarContactos();

        setVisible(true);
    }

    private void inicializarComponentes() {
        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new FlowLayout());

        btnAgregar = new JButton("Agregar");
        btnModificar = new JButton("Modificar");
        btnEliminar = new JButton("Eliminar");

        panelSuperior.add(btnAgregar);
        panelSuperior.add(btnModificar);
        panelSuperior.add(btnEliminar);

        add(panelSuperior, BorderLayout.NORTH);

        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new BorderLayout());

        JPanel panelTabla = new JPanel();
        panelTabla.setLayout(new BorderLayout());

        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(columnas);

        tablaContactos = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(tablaContactos);

        panelTabla.add(scrollPane, BorderLayout.CENTER);

        panelCentral.add(panelTabla, BorderLayout.CENTER);

        add(panelCentral, BorderLayout.CENTER);

        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirDialogoAgregarContacto();
            }
        });

        btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = tablaContactos.getSelectedRow();
                if (filaSeleccionada != -1) {
                    abrirDialogoModificarContacto(filaSeleccionada);
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un contacto para modificar.");
                }
            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = tablaContactos.getSelectedRow();
                if (filaSeleccionada != -1) {
                    int idContacto = (int) tableModel.getValueAt(filaSeleccionada, 0);
                    agenda.eliminarContactoPorId(idContacto);
                    cargarContactos();
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un contacto para eliminar.");
                }
            }
        });

        configurarVisibilidadBotones();
    }

    private void abrirDialogoAgregarContacto() {
        JDialog dialogo = new JDialog(this, "Agregar Contacto", true);
        dialogo.setLayout(new BorderLayout());

        JPanel panelCampos = new JPanel(new GridLayout(6, 2, 5, 5));
        JLabel lblDni = new JLabel("DNI:");
        JTextField txtDni = new JTextField(15);
        JLabel lblNombre = new JLabel("Nombre:");
        JTextField txtNombre = new JTextField(20);
        JLabel lblApellido = new JLabel("Apellido:");
        JTextField txtApellido = new JTextField(20);
        JLabel lblCorreo = new JLabel("Correo:");
        JTextField txtCorreo = new JTextField(30);
        JLabel lblDireccion = new JLabel("Dirección:");
        JTextField txtDireccion = new JTextField(30);
        JLabel lblLocalidad = new JLabel("Localidad:");
        JTextField txtLocalidad = new JTextField(20);

        panelCampos.add(lblDni);
        panelCampos.add(txtDni);
        panelCampos.add(lblNombre);
        panelCampos.add(txtNombre);
        panelCampos.add(lblApellido);
        panelCampos.add(txtApellido);
        panelCampos.add(lblCorreo);
        panelCampos.add(txtCorreo);
        panelCampos.add(lblDireccion);
        panelCampos.add(txtDireccion);
        panelCampos.add(lblLocalidad);
        panelCampos.add(txtLocalidad);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dni = txtDni.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String correo = txtCorreo.getText();
                String direccion = txtDireccion.getText();
                String localidad = txtLocalidad.getText();

                agenda.crearContacto(dni, nombre, apellido, correo, direccion, localidad, idUsuarioActual);
                cargarContactos();
                dialogo.dispose();
            }
        });

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialogo.dispose();
            }
        });

        JPanel panelBotones = new JPanel();
        panelBotones.add(btnGuardar);
        panelBotones.add(btnCancelar);

        dialogo.add(panelCampos, BorderLayout.CENTER);
        dialogo.add(panelBotones, BorderLayout.SOUTH);

        dialogo.pack();
        dialogo.setLocationRelativeTo(this);
        dialogo.setVisible(true);
    }

    private void abrirDialogoModificarContacto(int filaSeleccionada) {
        JDialog dialogo = new JDialog(this, "Modificar Contacto", true);
        dialogo.setLayout(new BorderLayout());

        JPanel panelCampos = new JPanel(new GridLayout(5, 2, 5, 5));

        JLabel lblNombre = new JLabel("Nombre:");
        JTextField txtNombre = new JTextField(20);
        JLabel lblApellido = new JLabel("Apellido:");
        JTextField txtApellido = new JTextField(20);
        JLabel lblCorreo = new JLabel("Correo:");
        JTextField txtCorreo = new JTextField(30);
        JLabel lblDireccion = new JLabel("Dirección:");
        JTextField txtDireccion = new JTextField(30);
        JLabel lblLocalidad = new JLabel("Localidad:");
        JTextField txtLocalidad = new JTextField(20);

        int idContacto = (int) tableModel.getValueAt(filaSeleccionada, 0);
        String nombreActual = (String) tableModel.getValueAt(filaSeleccionada, 1);
        String apellidoActual = (String) tableModel.getValueAt(filaSeleccionada, 2);
        String correoActual = (String) tableModel.getValueAt(filaSeleccionada, 3);
        String direccionActual = (String) tableModel.getValueAt(filaSeleccionada, 4);
        String localidadActual = (String) tableModel.getValueAt(filaSeleccionada, 5);

        txtNombre.setText(nombreActual);
        txtApellido.setText(apellidoActual);
        txtCorreo.setText(correoActual);
        txtDireccion.setText(direccionActual);
        txtLocalidad.setText(localidadActual);

        panelCampos.add(lblNombre);
        panelCampos.add(txtNombre);
        panelCampos.add(lblApellido);
        panelCampos.add(txtApellido);
        panelCampos.add(lblCorreo);
        panelCampos.add(txtCorreo);
        panelCampos.add(lblDireccion);
        panelCampos.add(txtDireccion);
        panelCampos.add(lblLocalidad);
        panelCampos.add(txtLocalidad);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String correo = txtCorreo.getText();
                String direccion = txtDireccion.getText();
                String localidad = txtLocalidad.getText();

                agenda.modificarContacto(idContacto, "", nombre, apellido, correo, direccion, localidad); // DNI vacío
                cargarContactos();
                dialogo.dispose();
            }
        });

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialogo.dispose();
            }
        });

        JPanel panelBotones = new JPanel();
        panelBotones.add(btnGuardar);
        panelBotones.add(btnCancelar);

        dialogo.add(panelCampos, BorderLayout.CENTER);
        dialogo.add(panelBotones, BorderLayout.SOUTH);

        dialogo.pack();
        dialogo.setLocationRelativeTo(this);
        dialogo.setVisible(true);
    }

    private void configurarVisibilidadBotones() {
        btnAgregar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }

    private void cargarContactos() {
        tableModel.setRowCount(0); // Limpiar la tabla antes de cargar los contactos

        List<Contactos> contactos;
        if (idUsuarioActual == 1) {
            // Mostrar todos los contactos
            contactos = agenda.mostrarTodosContactos();
        } else {
            // Mostrar los contactos relacionados al usuario actual
            contactos = agenda.obtenerContactosPorUsuario(idUsuarioActual);
        }

        for (Contactos contacto : contactos) {
            Object[] fila = {
                contacto.getId(),
                contacto.getNombre(),
                contacto.getApellido(),
                contacto.getCorreo(),
                contacto.getDireccion(),
                contacto.getLocalidad()
            };
            tableModel.addRow(fila);
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AgendaInterfaz(1); // Ejemplo de inicialización con ID de usuario 1
            }
        });
    }
}
