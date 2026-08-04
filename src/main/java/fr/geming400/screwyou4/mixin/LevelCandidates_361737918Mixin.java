package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelStorageSource.LevelCandidates.class)
public class LevelCandidates_361737918Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1747250176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1747250176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__773722058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-773722058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_400000659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(400000659L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_400016500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(400016500L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__1789878115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1789878115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levels()Ljava/util/List;", cancellable = true)
    private void levels_1988074733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1988074733L))
            info.setReturnValue(null);
    }


}
