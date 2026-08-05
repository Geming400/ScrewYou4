package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ResolutionContext.class)
public class ResolutionContext1392565317Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1516889720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1516889720L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_257105342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(257105342L))
            info.setReturnValue("kXH\u417C=}]\u6051KKp0/.>N%\uFC16QiHDv");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1430828059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1430828059L))
            info.setReturnValue(67283521);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/network/chat/ResolutionContext$Builder;", cancellable = true)
    private static void builder_1764288627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1764288627L))
            info.setReturnValue(new net.minecraft.network.chat.ResolutionContext.Builder());
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/network/chat/contents/objects/ObjectInfo;)Lnet/minecraft/network/chat/contents/objects/ObjectInfo;", cancellable = true)
    private void validate_2044248324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2044248324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "source()Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void source__892878988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-892878988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/network/chat/ResolutionContext;", cancellable = true)
    private static void create_1342624168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1342624168L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "depthLimit()I", cancellable = true)
    private void depthLimit_1430827563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1430827563L))
            info.setReturnValue(245807010);
    }

    @Inject(at = @At("HEAD"), method = "depthLimitBehavior()Lnet/minecraft/network/chat/ResolutionContext$LimitBehavior;", cancellable = true)
    private void depthLimitBehavior_1904506025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1904506025L))
            info.setReturnValue(net.minecraft.network.chat.ResolutionContext.LimitBehavior.DISCARD_REMAINING);
    }

    @Inject(at = @At("HEAD"), method = "defaultScoreboardEntity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void defaultScoreboardEntity__1073513525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1073513525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "objectInfoValidator()Ljava/util/function/Predicate;", cancellable = true)
    private void objectInfoValidator_742680339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(742680339L))
            info.setReturnValue(null);
    }


}
