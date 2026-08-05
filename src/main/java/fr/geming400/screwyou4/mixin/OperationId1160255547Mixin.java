package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.modifier.AttributeModifier.OperationId.class)
public class OperationId1160255547Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/attribute/modifier/AttributeModifier$OperationId;", cancellable = true)
    private static void values_1847796573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1847796573L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/attribute/modifier/AttributeModifier$OperationId;", cancellable = true)
    private static void valueOf_835061786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(835061786L))
            info.setReturnValue(net.minecraft.world.attribute.modifier.AttributeModifier.OperationId.SUBTRACT);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_24795076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(24795076L))
            info.setReturnValue("d'-?tHVv[K?YJ\u8EBDSMQo/A|WV\u58EC$2TH\uD335_A{] B';|Ho[Cr\uCC4D|4co4*:oy\"Nr\u6FDA/xBO=4W2?B\uAA4Cz\u6497)^q");
    }


}
