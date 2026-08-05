package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ResolvableProfile.Static.class)
public class Static_1859911710Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/util/Optional;", cancellable = true)
    private void name__1617118378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1617118378L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_951284945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(951284945L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1877703992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1877703992L))
            info.setReturnValue(400460383);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__515308338(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-515308338L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resolveProfile(Lnet/minecraft/server/players/ProfileResolver;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void resolveProfile__1731745630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1731745630L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
