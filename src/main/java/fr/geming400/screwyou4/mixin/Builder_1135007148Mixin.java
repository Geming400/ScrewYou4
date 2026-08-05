package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ResolutionContext.Builder.class)
public class Builder_1135007148Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/network/chat/ResolutionContext;", cancellable = true)
    private void build_2092986136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2092986136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDepthLimit(I)Lnet/minecraft/network/chat/ResolutionContext$Builder;", cancellable = true)
    private void setDepthLimit_549902856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(549902856L))
            info.setReturnValue(new net.minecraft.network.chat.ResolutionContext$Builder());
    }

    @Inject(at = @At("HEAD"), method = "withObjectInfoValidator(Ljava/util/function/Predicate;)Lnet/minecraft/network/chat/ResolutionContext$Builder;", cancellable = true)
    private void withObjectInfoValidator_1286042802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1286042802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDepthLimitBehavior(Lnet/minecraft/network/chat/ResolutionContext$LimitBehavior;)Lnet/minecraft/network/chat/ResolutionContext$Builder;", cancellable = true)
    private void setDepthLimitBehavior_308550812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(308550812L))
            info.setReturnValue(new net.minecraft.network.chat.ResolutionContext$Builder());
    }

    @Inject(at = @At("HEAD"), method = "withEntityOverride(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/network/chat/ResolutionContext$Builder;", cancellable = true)
    private void withEntityOverride__1150557528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1150557528L))
            info.setReturnValue(new net.minecraft.network.chat.ResolutionContext$Builder());
    }

    @Inject(at = @At("HEAD"), method = "withSource(Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/network/chat/ResolutionContext$Builder;", cancellable = true)
    private void withSource__1666753057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1666753057L))
            info.setReturnValue(null);
    }


}
