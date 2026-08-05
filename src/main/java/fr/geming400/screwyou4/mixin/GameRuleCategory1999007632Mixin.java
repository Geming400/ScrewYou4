package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gamerules.GameRuleCategory.class)
public class GameRuleCategory1999007632Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__910447405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-910447405L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_863547657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(863547657L))
            info.setReturnValue("X\u2878\uA3E3\u74ACMotXL1\u9A38-?-tm]za#&.H$Y=nva0&1\u4B75Gq7TE6:\u45EAlL6{%l\uC40549-jf+xbB6\u456C*\u2F76");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2037270374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2037270374L))
            info.setReturnValue(185151858);
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/level/gamerules/GameRuleCategory;", cancellable = true)
    private static void register__1200224516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1200224516L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__444058921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-444058921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "label()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void label__408996581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-408996581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDescriptionId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getDescriptionId__444058921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-444058921L))
            info.setReturnValue(null);
    }


}
