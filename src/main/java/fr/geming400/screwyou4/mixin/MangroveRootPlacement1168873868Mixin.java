package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.rootplacers.MangroveRootPlacement.class)
public class MangroveRootPlacement1168873868Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_260247600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(260247600L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1939297393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1939297393L))
            info.setReturnValue("\u79FC%\u08DC==K\uA4D0\u3A23>DN97eV\u262BI\u12DBdo;\uFA09xch/>o\u874972n.1`\u9D6D&g\uA71F>h\u6F04N8KQstF0|={V\"b6d2!1%h'X\uB518_)\uC379\u8123K*\u5DA14P\uAAAE7!s%\u3BB8\u5585\u0445u\u8BAFiFCP^&?=:5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1726225959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1726225959L))
            info.setReturnValue(2119009992);
    }

    @Inject(at = @At("HEAD"), method = "maxRootWidth()I", cancellable = true)
    private void maxRootWidth__609269134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609269134L))
            info.setReturnValue(-1813076812);
    }

    @Inject(at = @At("HEAD"), method = "muddyRootsIn()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void muddyRootsIn__1207322587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1207322587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomSkewChance()F", cancellable = true)
    private void randomSkewChance_875994830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(875994830L))
            info.setReturnValue(2.599843E8F);
    }

    @Inject(at = @At("HEAD"), method = "maxRootLength()I", cancellable = true)
    private void maxRootLength__1522968570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1522968570L))
            info.setReturnValue(1420501862);
    }

    @Inject(at = @At("HEAD"), method = "muddyRootsProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void muddyRootsProvider_1887279000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1887279000L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canGrowThrough()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void canGrowThrough__2102468638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2102468638L))
            info.setReturnValue(null);
    }


}
