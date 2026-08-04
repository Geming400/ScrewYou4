package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ResolvableProfile.Static.class)
public class Static_1859911710Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/util/Optional;", cancellable = true)
    private void name_2105373131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2105373131L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1049543824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1049543824L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1898173955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1898173955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveProfile(Lnet/minecraft/server/players/ProfileResolver;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void resolveProfile_835636421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(835636421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__682806681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-682806681L))
            info.cancel();
    }


}
