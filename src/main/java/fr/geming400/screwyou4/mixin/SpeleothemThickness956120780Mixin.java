package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.SpeleothemThickness.class)
public class SpeleothemThickness956120780Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1726543809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1726543809L))
            info.setReturnValue("\uD415CBN\u7BBD;12:SUR@w4Z62]4");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/SpeleothemThickness;", cancellable = true)
    private static void values__448543969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-448543969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/SpeleothemThickness;", cancellable = true)
    private static void valueOf__2068949658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2068949658L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.SpeleothemThickness.TIP_MERGE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1044329402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1044329402L))
            info.setReturnValue("uk");
    }


}
