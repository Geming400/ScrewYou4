package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelStorageSource.LevelCandidates.class)
public class LevelCandidates_361737918Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__546888351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-546888351L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1132161442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1132161442L))
            info.setReturnValue("3h%\uB3DDE\uAD7DO|!,[\u2B7961 n&&L\u20ECvv{FTRLw,eL233&3+\u61B9\u856Anv\u10F3!dLtx? N49.\uAF0AHOg");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_919090008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(919090008L))
            info.setReturnValue(1846104808);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1420854289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420854289L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator_1995816715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1995816715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levels()Ljava/util/List;", cancellable = true)
    private void levels_1017603292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1017603292L))
            info.setReturnValue(null);
    }


}
