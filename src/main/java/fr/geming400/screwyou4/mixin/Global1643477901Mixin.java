package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.Configuration.Global.class)
public class Global1643477901Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_734851633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(734851633L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1881065870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1881065870L))
            info.setReturnValue(":6Z\uB266Df5Oy@U/i&4&9hv\u73E4f9\uC3CELGCr3p\u366FLNDX\u71D40\u45D1|[i>EM|\uD406pR_L");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2094137304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2094137304L))
            info.setReturnValue(-231814134);
    }

    @Inject(at = @At("HEAD"), method = "alwaysRepack()Z", cancellable = true)
    private void alwaysRepack_553932905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(553932905L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "bitsInStorage()I", cancellable = true)
    private void bitsInStorage_1808720963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1808720963L))
            info.setReturnValue(-1192150168);
    }

    @Inject(at = @At("HEAD"), method = "createPalette(Lnet/minecraft/world/level/chunk/Strategy;Ljava/util/List;)Lnet/minecraft/world/level/chunk/Palette;", cancellable = true)
    private void createPalette__1013285020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1013285020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bitsInMemory()I", cancellable = true)
    private void bitsInMemory__60697785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-60697785L))
            info.setReturnValue(575121963);
    }


}
