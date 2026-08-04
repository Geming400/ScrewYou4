package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.Container.ContainerIterator.class)
public class ContainerIterator_1064226202Mixin {
        @Inject(at = @At("HEAD"), method = "hasNext()Z", cancellable = true)
    private void hasNext_1102504784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1102504784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "next()Ljava/lang/Object;", cancellable = true)
    private void next__1371419916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1371419916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "next()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void next_1587644861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1587644861L))
            info.setReturnValue(null);
    }


}
