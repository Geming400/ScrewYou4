package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.golem.CopperGolemState.class)
public class CopperGolemState1599222670Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/golem/CopperGolemState;", cancellable = true)
    private static void values_1612417618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1612417618L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/golem/CopperGolemState;", cancellable = true)
    private static void valueOf_693243673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(693243673L))
            info.setReturnValue(net.minecraft.world.entity.animal.golem.CopperGolemState.DROPPING_ITEM);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1687431292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1687431292L))
            info.setReturnValue("c\u33DD=|iuqw\u6524:x716ao\uAE9B|`R\uBFB9[}PNc7z!96'MFq0sm\uF977\u30DBT");
    }


}
