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
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getName(Ljava/lang/Comparable;)Ljava/lang/String;", cancellable = true)
    private void getName__254605592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-254605592L))
            info.setReturnValue(null);
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

    @Inject(at = @At("HEAD"), method = "getPossibleValues()Ljava/util/List;", cancellable = true)
    private void getPossibleValues__1752574832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1752574832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInternalIndex(Ljava/lang/Comparable;)I", cancellable = true)
    private void getInternalIndex__334952217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-334952217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInternalIndex(Ljava/lang/Boolean;)I", cancellable = true)
    private void getInternalIndex_1881139657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1881139657L))
            info.setReturnValue(null);
    }


}
