package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.Gizmos.class)
public class Gizmos886011601Mixin {
        @Inject(at = @At("HEAD"), method = "line(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void line__783835873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-783835873L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "line(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;IF)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void line_1781021411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1781021411L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "point(Lnet/minecraft/world/phys/Vec3;IF)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void point_673929043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(673929043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "arrow(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;IF)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void arrow__2072908616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2072908616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "arrow(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void arrow_1724243114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1724243114L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "circle(Lnet/minecraft/world/phys/Vec3;FLnet/minecraft/gizmos/GizmoStyle;)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void circle_454104616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(454104616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "billboardText(Ljava/lang/String;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/gizmos/TextGizmo$Style;)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void billboardText_128456743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(128456743L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withCollector(Lnet/minecraft/gizmos/GizmoCollector;)Lnet/minecraft/gizmos/Gizmos$TemporaryCollection;", cancellable = true)
    private static void withCollector__111206800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-111206800L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cuboid(Lnet/minecraft/world/phys/AABB;Lnet/minecraft/gizmos/GizmoStyle;)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void cuboid__760004237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-760004237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cuboid(Lnet/minecraft/world/phys/AABB;Lnet/minecraft/gizmos/GizmoStyle;Z)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void cuboid_706299771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(706299771L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cuboid(Lnet/minecraft/core/BlockPos;FLnet/minecraft/gizmos/GizmoStyle;)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void cuboid_2017481686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017481686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cuboid(Lnet/minecraft/core/BlockPos;Lnet/minecraft/gizmos/GizmoStyle;)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void cuboid_1790914940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1790914940L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "billboardTextOverMob(Lnet/minecraft/world/entity/Entity;ILjava/lang/String;IF)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void billboardTextOverMob_143112773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143112773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "billboardTextOverBlock(Ljava/lang/String;Lnet/minecraft/core/BlockPos;IIF)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void billboardTextOverBlock_903250637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(903250637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rect(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/gizmos/GizmoStyle;)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void rect__36451926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-36451926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rect(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/core/Direction;Lnet/minecraft/gizmos/GizmoStyle;)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void rect_1199899702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199899702L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addGizmo(Lnet/minecraft/gizmos/Gizmo;)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private static void addGizmo__2015301682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2015301682L))
            info.setReturnValue(null);
    }


}
