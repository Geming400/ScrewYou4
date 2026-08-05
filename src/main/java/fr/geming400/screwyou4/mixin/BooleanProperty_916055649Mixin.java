package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.BooleanProperty.class)
public class BooleanProperty_916055649Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Ljava/lang/Boolean;)Ljava/lang/String;", cancellable = true)
    private void getName__1697362234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1697362234L))
            info.setReturnValue("[Vwiq\u40DFS8\u4484\u9D629wXA.\uFEA1T5f!pc&\u273CC\u964D0A(58A+W`Ebtgwn\u7D853fz\u712CD\u9631\u9382|)9\uA068\u1405\uAB3AZE");
    }

    @Inject(at = @At("HEAD"), method = "getName(Ljava/lang/Comparable;)Ljava/lang/String;", cancellable = true)
    private void getName__254605592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-254605592L))
            info.setReturnValue("M)Y^k\u0F84m=Yx+0,\uBCAA1;kF_{\u0FAE+[\u8CD5@\u3FB8]H\u6A59YkGKq]sD)Vz4");
    }

    @Inject(at = @At("HEAD"), method = "getValue(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getValue__1368876092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1368876092L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/BooleanProperty;", cancellable = true)
    private static void create__1590278049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1590278049L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInternalIndex(Ljava/lang/Comparable;)I", cancellable = true)
    private void getInternalIndex__334952217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-334952217L))
            info.setReturnValue(-903436934);
    }

    @Inject(at = @At("HEAD"), method = "getInternalIndex(Ljava/lang/Boolean;)I", cancellable = true)
    private void getInternalIndex_1881139657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1881139657L))
            info.setReturnValue(-2066787641);
    }

    @Inject(at = @At("HEAD"), method = "getPossibleValues()Ljava/util/List;", cancellable = true)
    private void getPossibleValues__1752574832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1752574832L))
            info.setReturnValue(null);
    }


}
