package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.BooleanProperty.class)
public class BooleanProperty_916055649Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Ljava/lang/Boolean;)Ljava/lang/String;", cancellable = true)
    private void getName__1089339163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1089339163L))
            info.setReturnValue("\u217E1Icy?gB\u2FA21n");
    }

    @Inject(at = @At("HEAD"), method = "getName(Ljava/lang/Comparable;)Ljava/lang/String;", cancellable = true)
    private void getName_1483615337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1483615337L))
            info.setReturnValue("WA\uFF91D+\uCFF4_\u7693-n&)\"GA*ru V\uCE14FO^os\"UJ\u7666-gXIC");
    }

    @Inject(at = @At("HEAD"), method = "getValue(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getValue_1825175999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1825175999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/BooleanProperty;", cancellable = true)
    private static void create_1214371163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1214371163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInternalIndex(Ljava/lang/Comparable;)I", cancellable = true)
    private void getInternalIndex_1451845928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1451845928L))
            info.setReturnValue(-1032196787);
    }

    @Inject(at = @At("HEAD"), method = "getInternalIndex(Ljava/lang/Boolean;)I", cancellable = true)
    private void getInternalIndex_1145067816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1145067816L))
            info.setReturnValue(1479404221);
    }

    @Inject(at = @At("HEAD"), method = "getPossibleValues()Ljava/util/List;", cancellable = true)
    private void getPossibleValues_714894585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(714894585L))
            info.setReturnValue(null);
    }


}
