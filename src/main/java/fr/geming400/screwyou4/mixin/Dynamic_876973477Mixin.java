package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ResolvableProfile.Dynamic.class)
public class Dynamic_876973477Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/util/Optional;", cancellable = true)
    private void name_1122434898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1122434898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2032482057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2032482057L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_915235722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(915235722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1665744914(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1665744914L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resolveProfile(Lnet/minecraft/server/players/ProfileResolver;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void resolveProfile__147301812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-147301812L))
            info.setReturnValue(null);
    }


}
