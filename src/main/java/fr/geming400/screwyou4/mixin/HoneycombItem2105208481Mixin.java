package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.HoneycombItem.class)
public class HoneycombItem2105208481Mixin {
        @Inject(at = @At("HEAD"), method = "tryApplyToSign(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/entity/SignBlockEntity;ZLnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void tryApplyToSign_2089576510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2089576510L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canApplyToSign(Lnet/minecraft/world/level/block/entity/SignText;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void canApplyToSign__395912467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-395912467L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn_1190091248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1190091248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWaxed(Lnet/minecraft/world/level/block/state/BlockState;)Ljava/util/Optional;", cancellable = true)
    private static void getWaxed__602119345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-602119345L))
            info.setReturnValue(null);
    }


}
