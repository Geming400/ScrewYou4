package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ResolutionContext.class)
public class ResolutionContext1392565317Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_483939049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(483939049L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2131978454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2131978454L))
            info.setReturnValue("5z\"7U/ !\u215D5\uA66DnS\uCF82\u864A*x[R\u03C7h&(a#G*4\u7E0Chfan\u34B66\u5AF2-%OVvHh,mLx]O2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1949917408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1949917408L))
            info.setReturnValue(-1917547832);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/network/chat/ResolutionContext$Builder;", cancellable = true)
    private static void builder_90640462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90640462L))
            info.setReturnValue(new net.minecraft.network.chat.ResolutionContext.Builder());
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/network/chat/contents/objects/ObjectInfo;)Lnet/minecraft/network/chat/contents/objects/ObjectInfo;", cancellable = true)
    private void validate_329706266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(329706266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "source()Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void source_945383929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(945383929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/network/chat/ResolutionContext;", cancellable = true)
    private static void create_3670572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(3670572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "depthLimitBehavior()Lnet/minecraft/network/chat/ResolutionContext$LimitBehavior;", cancellable = true)
    private void depthLimitBehavior__848570925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848570925L))
            info.setReturnValue(net.minecraft.network.chat.ResolutionContext.LimitBehavior.STOP_PROCESSING_AND_COPY_REMAINING);
    }

    @Inject(at = @At("HEAD"), method = "defaultScoreboardEntity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void defaultScoreboardEntity__978448429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-978448429L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "objectInfoValidator()Ljava/util/function/Predicate;", cancellable = true)
    private void objectInfoValidator__104002792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-104002792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "depthLimit()I", cancellable = true)
    private void depthLimit__413609357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-413609357L))
            info.setReturnValue(1959931701);
    }


}
