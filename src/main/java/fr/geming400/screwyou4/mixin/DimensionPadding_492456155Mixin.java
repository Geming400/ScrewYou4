package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.DimensionPadding.class)
public class DimensionPadding_492456155Mixin {
        @Inject(at = @At("HEAD"), method = "bottom()I", cancellable = true)
    private void bottom__169531531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-169531531L))
            info.setReturnValue(-1327013894);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__416170114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-416170114L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1262879679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262879679L))
            info.setReturnValue("3d`dNz(Gy#0l4-TB\uD33APk_ \uC4B5|\u24B3!$PnG\u7BCA}V.\uC37Fxl\u4624;%zCA|+\u5930j>YO\"\uAEF8'5{O");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1049808245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1049808245L))
            info.setReturnValue(-2010648121);
    }

    @Inject(at = @At("HEAD"), method = "top()I", cancellable = true)
    private void top__526587253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-526587253L))
            info.setReturnValue(-714207092);
    }

    @Inject(at = @At("HEAD"), method = "hasEqualTopAndBottom()Z", cancellable = true)
    private void hasEqualTopAndBottom__731216886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-731216886L))
            info.setReturnValue(true);
    }


}
