package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundRecipeBookAddPacket.Entry.class)
public class Entry778288551Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__130337717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-130337717L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1548712076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1548712076L))
            info.setReturnValue("c+F\uC3DFJ@\u6D3A\u71A5=X\u5A97 -O;L5M\u71F0;");
    }

    @Inject(at = @At("HEAD"), method = "flags()B", cancellable = true)
    private void flags_2080278303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2080278303L))
            info.setReturnValue(98);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1335640642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335640642L))
            info.setReturnValue(548220844);
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/world/item/crafting/display/RecipeDisplayEntry;", cancellable = true)
    private void contents_636647970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(636647970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "highlight()Z", cancellable = true)
    private void highlight_1241913130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1241913130L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "notification()Z", cancellable = true)
    private void notification__846650029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-846650029L))
            info.setReturnValue(true);
    }


}
