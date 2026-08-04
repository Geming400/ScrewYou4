package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.functions.StringTemplate.class)
public class StringTemplate713759963Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2099272222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2099272222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__421700012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-421700012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_752022705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(752022705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "segments()Ljava/util/List;", cancellable = true)
    private void segments__1954870517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1954870517L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromString(Ljava/lang/String;)Lnet/minecraft/commands/functions/StringTemplate;", cancellable = true)
    private static void fromString_1514381359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514381359L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "substitute(Ljava/util/List;)Ljava/lang/String;", cancellable = true)
    private void substitute_1745480147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1745480147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "variables()Ljava/util/List;", cancellable = true)
    private void variables__1954870517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1954870517L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidVariableName(Ljava/lang/String;)Z", cancellable = true)
    private static void isValidVariableName_1866125204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866125204L))
            info.setReturnValue(null);
    }


}
