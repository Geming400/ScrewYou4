package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.DispenserBlockEntity.class)
public class DispenserBlockEntity950157649Mixin {
        @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize_988419895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(988419895L))
            info.setReturnValue(1361849367);
    }

    @Inject(at = @At("HEAD"), method = "getRandomSlot(Lnet/minecraft/util/RandomSource;)I", cancellable = true)
    private void getRandomSlot__756869929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-756869929L))
            info.setReturnValue(1719129001);
    }

    @Inject(at = @At("HEAD"), method = "insertItem(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void insertItem_903614768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(903614768L))
            info.setReturnValue(null);
    }


}
