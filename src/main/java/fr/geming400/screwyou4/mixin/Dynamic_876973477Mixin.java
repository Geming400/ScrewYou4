package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ResolvableProfile.Dynamic.class)
public class Dynamic_876973477Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/util/Optional;", cancellable = true)
    private void name_1694910685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1694910685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__31653288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-31653288L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1434325071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1434325071L))
            info.setReturnValue(194466021);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1498246571(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1498246571L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resolveProfile(Lnet/minecraft/server/players/ProfileResolver;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void resolveProfile_1580283433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580283433L))
            info.setReturnValue(null);
    }


}
