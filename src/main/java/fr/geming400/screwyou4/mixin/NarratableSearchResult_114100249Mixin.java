package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.Screen.NarratableSearchResult.class)
public class NarratableSearchResult_114100249Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_808216684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(808216684L))
            info.setReturnValue(1709457849);
    }

    @Inject(at = @At("HEAD"), method = "priority()Lnet/minecraft/client/gui/narration/NarratableEntry$NarrationPriority;", cancellable = true)
    private void priority__1766803673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1766803673L))
            info.setReturnValue(net.minecraft.client.gui.narration.NarratableEntry.NarrationPriority.HOVERED);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__794526020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-794526020L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_884523773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(884523773L))
            info.setReturnValue("QV|6\"ov\u4043]cuE?*\u525EVGYR[F\u3C25,\"!");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_671452339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(671452339L))
            info.setReturnValue(-1295994039);
    }

    @Inject(at = @At("HEAD"), method = "entry()Lnet/minecraft/client/gui/narration/NarratableEntry;", cancellable = true)
    private void entry_1121828055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1121828055L))
            info.setReturnValue(null);
    }


}
