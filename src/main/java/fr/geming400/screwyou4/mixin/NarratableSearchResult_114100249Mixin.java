package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.Screen.NarratableSearchResult.class)
public class NarratableSearchResult_114100249Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_152362494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(152362494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "priority()Lnet/minecraft/client/gui/narration/NarratableEntry$NarrationPriority;", cancellable = true)
    private void priority_945822339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(945822339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1499612507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1499612507L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1021359727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1021359727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_152362990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(152362990L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entry()Lnet/minecraft/client/gui/narration/NarratableEntry;", cancellable = true)
    private void entry_99005029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(99005029L))
            info.setReturnValue(null);
    }


}
