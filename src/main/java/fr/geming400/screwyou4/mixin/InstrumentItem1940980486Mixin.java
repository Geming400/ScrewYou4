package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.InstrumentItem.class)
public class InstrumentItem1940980486Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/item/Item;Lnet/minecraft/core/Holder;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void create__953399924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-953399924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use__1943610775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1943610775L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUseDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void getUseDuration_1043799831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1043799831L))
            info.setReturnValue(999051648);
    }

    @Inject(at = @At("HEAD"), method = "getUseAnimation(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private void getUseAnimation__1794155276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1794155276L))
            info.setReturnValue(net.minecraft.world.item.ItemUseAnimation.SPYGLASS);
    }


}
