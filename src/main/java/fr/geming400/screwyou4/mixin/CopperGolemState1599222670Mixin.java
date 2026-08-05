package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.golem.CopperGolemState.class)
public class CopperGolemState1599222670Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/golem/CopperGolemState;", cancellable = true)
    private static void values_794706868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(794706868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/golem/CopperGolemState;", cancellable = true)
    private static void valueOf_1754045425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1754045425L))
            info.setReturnValue(net.minecraft.world.entity.animal.golem.CopperGolemState.DROPPING_NO_ITEM);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_463762199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(463762199L))
            info.setReturnValue("l3PnvibٌgX A#F|lԡJ2&$;c茪w█yh2m4aof#d8HOvxꬊᅮ$Ne8hT<SB.;5N9Q");
    }


}
