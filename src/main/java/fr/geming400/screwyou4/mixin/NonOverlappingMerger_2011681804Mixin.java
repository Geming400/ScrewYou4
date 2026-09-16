package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.NonOverlappingMerger.class)
public class NonOverlappingMerger_2011681804Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size__1839553904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1839553904L))
            info.setReturnValue(959976594);
    }

    @Inject(at = @At("HEAD"), method = "getDouble(I)D", cancellable = true)
    private void getDouble__883251924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-883251924L))
            info.setReturnValue(9.718768000609491E8D);
    }

    @Inject(at = @At("HEAD"), method = "getList()Lit/unimi/dsi/fastutil/doubles/DoubleList;", cancellable = true)
    private void getList__2007865988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2007865988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forMergedIndexes(Lnet/minecraft/world/phys/shapes/IndexMerger$IndexConsumer;)Z", cancellable = true)
    private void forMergedIndexes__1090244187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090244187L))
            info.setReturnValue(false);
    }


}
