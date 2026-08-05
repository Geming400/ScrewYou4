package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.Container.ContainerIterator.class)
public class ContainerIterator_1064226202Mixin {
        @Inject(at = @At("HEAD"), method = "hasNext()Z", cancellable = true)
    private void hasNext_1142297283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1142297283L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "next()Ljava/lang/Object;", cancellable = true)
    private void next_1608928679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1608928679L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "next()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void next__1022630480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1022630480L))
            info.setReturnValue(null);
    }


}
