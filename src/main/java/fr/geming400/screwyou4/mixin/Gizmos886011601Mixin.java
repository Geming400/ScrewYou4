package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.Gizmos.class)
public class Gizmos886011601Mixin {
        @Inject(at = @At("HEAD"), method = "line(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void line_1078798995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078798995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "line(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;IF)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void line__606839825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-606839825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "point(Lnet/minecraft/world/phys/Vec3;IF)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void point_1714374371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1714374371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withCollector(Lnet/minecraft/gizmos/GizmoCollector;)Lnet/minecraft/gizmos/Gizmos$TemporaryCollection;", cancellable = true)
    private static void withCollector__1238049079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1238049079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rect(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/core/Direction;Lnet/minecraft/gizmos/GizmoStyle;)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void rect_526890650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(526890650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rect(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/gizmos/GizmoStyle;)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void rect__155980786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-155980786L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addGizmo(Lnet/minecraft/gizmos/Gizmo;)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void addGizmo__375913675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-375913675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "arrow(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;IF)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void arrow__606839825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-606839825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "arrow(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void arrow_1078798995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078798995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cuboid(Lnet/minecraft/world/phys/AABB;Lnet/minecraft/gizmos/GizmoStyle;)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void cuboid__1636174759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1636174759L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cuboid(Lnet/minecraft/world/phys/AABB;Lnet/minecraft/gizmos/GizmoStyle;Z)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void cuboid__685182635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-685182635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cuboid(Lnet/minecraft/core/BlockPos;Lnet/minecraft/gizmos/GizmoStyle;)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void cuboid_239166946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(239166946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cuboid(Lnet/minecraft/core/BlockPos;FLnet/minecraft/gizmos/GizmoStyle;)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void cuboid_1157934128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1157934128L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "circle(Lnet/minecraft/world/phys/Vec3;FLnet/minecraft/gizmos/GizmoStyle;)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void circle_531051768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(531051768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "billboardText(Ljava/lang/String;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/gizmos/TextGizmo$Style;)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void billboardText_2038132659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2038132659L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "billboardTextOverBlock(Ljava/lang/String;Lnet/minecraft/core/BlockPos;IIF)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void billboardTextOverBlock_794447840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(794447840L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "billboardTextOverMob(Lnet/minecraft/world/entity/Entity;ILjava/lang/String;IF)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void billboardTextOverMob_1570260837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1570260837L))
            info.setReturnValue(null);
    }


}
