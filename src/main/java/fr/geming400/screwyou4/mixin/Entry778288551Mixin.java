package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundRecipeBookAddPacket.Entry.class)
public class Entry778288551Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2131166486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2131166486L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__357171424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-357171424L))
            info.setReturnValue("i']|>aX⤖mﺩI]we?WOS堄ⷭᔽ.tfk螻KtA-&LG0(YU=FDVSe[> ");
    }

    @Inject(at = @At("HEAD"), method = "flags()B", cancellable = true)
    private void flags_816544070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(816544070L))
            info.setReturnValue(-27);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_816551293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(816551293L))
            info.setReturnValue(1324045984);
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/world/item/crafting/display/RecipeDisplayEntry;", cancellable = true)
    private void contents__153137784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-153137784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "notification()Z", cancellable = true)
    private void notification_816567134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(816567134L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "highlight()Z", cancellable = true)
    private void highlight_816567134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(816567134L))
            info.setReturnValue(true);
    }


}
