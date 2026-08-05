package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.ModelPart.Vertex.class)
public class Vertex674310094Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2059822353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2059822353L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__461149881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-461149881L))
            info.setReturnValue("G9=J苭<5++JoI}ꟲw\"7D^e氠\"Px48Pc⪾yOඇ=h,92}^kd簧dEd7㈡C蛲%'yhK-dUp,1=^-^Fh-P(嬟");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_712572836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712572836L))
            info.setReturnValue(-935154735);
    }

    @Inject(at = @At("HEAD"), method = "x()F", cancellable = true)
    private void x_712569457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712569457L))
            info.setReturnValue(6.99531E7F);
    }

    @Inject(at = @At("HEAD"), method = "v()F", cancellable = true)
    private void v_712569457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712569457L))
            info.setReturnValue(6.99531E7F);
    }

    @Inject(at = @At("HEAD"), method = "z()F", cancellable = true)
    private void z_712569457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712569457L))
            info.setReturnValue(6.99531E7F);
    }

    @Inject(at = @At("HEAD"), method = "u()F", cancellable = true)
    private void u_712569457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712569457L))
            info.setReturnValue(6.99531E7F);
    }

    @Inject(at = @At("HEAD"), method = "y()F", cancellable = true)
    private void y_712569457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712569457L))
            info.setReturnValue(6.99531E7F);
    }

    @Inject(at = @At("HEAD"), method = "remap(FF)Lnet/minecraft/client/model/geom/ModelPart$Vertex;", cancellable = true)
    private void remap_1458772403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1458772403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "worldZ()F", cancellable = true)
    private void worldZ_712569457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712569457L))
            info.setReturnValue(6.99531E7F);
    }

    @Inject(at = @At("HEAD"), method = "worldY()F", cancellable = true)
    private void worldY_712569457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712569457L))
            info.setReturnValue(6.99531E7F);
    }

    @Inject(at = @At("HEAD"), method = "worldX()F", cancellable = true)
    private void worldX_712569457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712569457L))
            info.setReturnValue(6.99531E7F);
    }


}
