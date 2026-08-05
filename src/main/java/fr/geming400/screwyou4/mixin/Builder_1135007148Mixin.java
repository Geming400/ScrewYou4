package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ResolutionContext.Builder.class)
public class Builder_1135007148Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/network/chat/ResolutionContext;", cancellable = true)
    private void build__463110650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-463110650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSource(Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/network/chat/ResolutionContext$Builder;", cancellable = true)
    private void withSource__1115424258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1115424258L))
            info.setReturnValue(new net.minecraft.network.chat.ResolutionContext.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setDepthLimitBehavior(Lnet/minecraft/network/chat/ResolutionContext$LimitBehavior;)Lnet/minecraft/network/chat/ResolutionContext$Builder;", cancellable = true)
    private void setDepthLimitBehavior__1395181368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1395181368L))
            info.setReturnValue(new net.minecraft.network.chat.ResolutionContext.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setDepthLimit(I)Lnet/minecraft/network/chat/ResolutionContext$Builder;", cancellable = true)
    private void setDepthLimit_1954399502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1954399502L))
            info.setReturnValue(new net.minecraft.network.chat.ResolutionContext.Builder());
    }

    @Inject(at = @At("HEAD"), method = "withObjectInfoValidator(Ljava/util/function/Predicate;)Lnet/minecraft/network/chat/ResolutionContext$Builder;", cancellable = true)
    private void withObjectInfoValidator_705751633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(705751633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withEntityOverride(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/network/chat/ResolutionContext$Builder;", cancellable = true)
    private void withEntityOverride__92604525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-92604525L))
            info.setReturnValue(new net.minecraft.network.chat.ResolutionContext.Builder());
    }


}
