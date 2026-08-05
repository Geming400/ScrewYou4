package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.consume_effects.TeleportRandomlyConsumeEffect.class)
public class TeleportRandomlyConsumeEffect_1166983500Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1742471538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742471538L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_31523524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(31523524L))
            info.setReturnValue("XzDRpIb76amLC[dyD≡@*櫉nCW");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1205246241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1205246241L))
            info.setReturnValue(-1565735798);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void apply_1159670686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1159670686L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/item/consume_effects/ConsumeEffect$Type;", cancellable = true)
    private void getType_574246115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(574246115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "diameter()F", cancellable = true)
    private void diameter_1205242862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1205242862L))
            info.setReturnValue(5.339029E8F);
    }


}
