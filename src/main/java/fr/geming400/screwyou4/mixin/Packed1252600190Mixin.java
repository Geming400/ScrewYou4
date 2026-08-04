package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.Abilities.Packed.class)
public class Packed1252600190Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1656854847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1656854847L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_117140215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(117140215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1290862932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290862932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flying()Z", cancellable = true)
    private void flying_1290878773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290878773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mayBuild()Z", cancellable = true)
    private void mayBuild_1290878773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290878773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instabuild()Z", cancellable = true)
    private void instabuild_1290878773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290878773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "walkingSpeed()F", cancellable = true)
    private void walkingSpeed_1290859553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290859553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flyingSpeed()F", cancellable = true)
    private void flyingSpeed_1290859553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290859553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "invulnerable()Z", cancellable = true)
    private void invulnerable_1290878773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290878773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mayFly()Z", cancellable = true)
    private void mayFly_1290878773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290878773L))
            info.setReturnValue(null);
    }


}
