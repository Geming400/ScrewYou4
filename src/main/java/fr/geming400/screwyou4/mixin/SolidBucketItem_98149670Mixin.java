package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.SolidBucketItem.class)
public class SolidBucketItem_98149670Mixin {
        @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__1810693586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1810693586L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyContents(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/BlockHitResult;)Z", cancellable = true)
    private void emptyContents__1136895057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1136895057L))
            info.setReturnValue(null);
    }


}
