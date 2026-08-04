package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.IdenticalMerger.class)
public class IdenticalMerger295850593Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_334112839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(334112839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getList()Lit/unimi/dsi/fastutil/doubles/DoubleList;", cancellable = true)
    private void getList__557609538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-557609538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forMergedIndexes(Lnet/minecraft/world/phys/shapes/IndexMerger$IndexConsumer;)Z", cancellable = true)
    private void forMergedIndexes_1069072912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1069072912L))
            info.setReturnValue(null);
    }


}
