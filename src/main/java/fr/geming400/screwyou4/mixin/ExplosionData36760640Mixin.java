package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.SulfurCubeArchetype.ExplosionData.class)
public class ExplosionData36760640Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1422272899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1422272899L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1098699335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1098699335L))
            info.setReturnValue("S1XIH{a9cJmM13n)+Y{o1hW59HBx掍nNB&K祬@{㹩!*<%MS﹕\"nOQ{Eh_('TeX;틺Z㙽x2dTw0쪤`oPT簤M%௰XU1b|y |J3Vﺿ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_75023382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(75023382L))
            info.setReturnValue(-153587839);
    }

    @Inject(at = @At("HEAD"), method = "power()I", cancellable = true)
    private void power_75022886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(75022886L))
            info.setReturnValue(24935650);
    }

    @Inject(at = @At("HEAD"), method = "causesFire()Z", cancellable = true)
    private void causesFire_75039223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(75039223L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "fuse()I", cancellable = true)
    private void fuse_75022886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(75022886L))
            info.setReturnValue(24935650);
    }


}
