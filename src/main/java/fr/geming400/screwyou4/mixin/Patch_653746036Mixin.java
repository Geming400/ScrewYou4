package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.PlayerSkin.Patch.class)
public class Patch_653746036Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2039258294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2039258294L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__481713940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-481713940L))
            info.setReturnValue("XV]K_I)|2lSY苕x-^F+䀎ZheX%n<KmjC!픧w}.R6&m?mD)80o{fM7퀯P&雥4Q(.&Y䥢");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_692008777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(692008777L))
            info.setReturnValue(-1025111254);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/util/Optional;Ljava/util/Optional;Ljava/util/Optional;Ljava/util/Optional;)Lnet/minecraft/world/entity/player/PlayerSkin$Patch;", cancellable = true)
    private static void create__1593760984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1593760984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "model()Ljava/util/Optional;", cancellable = true)
    private void model_899207457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(899207457L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "body()Ljava/util/Optional;", cancellable = true)
    private void body_899207457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(899207457L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cape()Ljava/util/Optional;", cancellable = true)
    private void cape_899207457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(899207457L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "elytra()Ljava/util/Optional;", cancellable = true)
    private void elytra_899207457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(899207457L))
            info.setReturnValue(null);
    }


}
