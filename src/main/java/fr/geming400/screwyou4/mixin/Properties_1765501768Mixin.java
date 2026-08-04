package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.RuinedPortalPiece.Properties.class)
public class Properties_1765501768Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1143953270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143953270L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_630041792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(630041792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1803764509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1803764509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cold()Z", cancellable = true)
    private void cold_1803780350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1803780350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceWithBlackstone()Z", cancellable = true)
    private void replaceWithBlackstone_1803780350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1803780350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "airPocket()Z", cancellable = true)
    private void airPocket_1803780350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1803780350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mossiness()F", cancellable = true)
    private void mossiness_1803761130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1803761130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overgrown()Z", cancellable = true)
    private void overgrown_1803780350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1803780350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vines()Z", cancellable = true)
    private void vines_1803780350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1803780350L))
            info.setReturnValue(null);
    }


}
