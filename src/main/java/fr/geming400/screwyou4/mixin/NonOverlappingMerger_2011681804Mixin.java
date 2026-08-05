package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.NonOverlappingMerger.class)
public class NonOverlappingMerger_2011681804Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_2049944049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2049944049L))
            info.setReturnValue(209849271);
    }

    @Inject(at = @At("HEAD"), method = "getDouble(I)D", cancellable = true)
    private void getDouble__1069385819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1069385819L))
            info.setReturnValue(6.533118002239034E8D);
    }

    @Inject(at = @At("HEAD"), method = "getList()Lit/unimi/dsi/fastutil/doubles/DoubleList;", cancellable = true)
    private void getList_1158221672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1158221672L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forMergedIndexes(Lnet/minecraft/world/phys/shapes/IndexMerger$IndexConsumer;)Z", cancellable = true)
    private void forMergedIndexes__1510063174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1510063174L))
            info.setReturnValue(true);
    }


}
