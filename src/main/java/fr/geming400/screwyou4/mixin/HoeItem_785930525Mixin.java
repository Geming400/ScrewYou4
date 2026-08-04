package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.HoeItem.class)
public class HoeItem_785930525Mixin {
        @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__1122912731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1122912731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "changeIntoStateAndDropItem(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/ItemLike;)Ljava/util/function/Consumer;", cancellable = true)
    private static void changeIntoStateAndDropItem_484355011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484355011L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onlyIfAirAbove(Lnet/minecraft/world/item/context/UseOnContext;)Z", cancellable = true)
    private static void onlyIfAirAbove__2096113010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2096113010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "changeIntoState(Lnet/minecraft/world/level/block/state/BlockState;)Ljava/util/function/Consumer;", cancellable = true)
    private static void changeIntoState__609793126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609793126L))
            info.setReturnValue(null);
    }


}
