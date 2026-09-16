package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation.class)
public class Operation_1173537568Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/ai/attributes/AttributeModifier$Operation;", cancellable = true)
    private static void values_63156786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(63156786L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/ai/attributes/AttributeModifier$Operation;", cancellable = true)
    private static void valueOf__1557248903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1557248903L))
            info.setReturnValue(net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation.ADD_VALUE);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id__1521646390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1521646390L))
            info.setReturnValue(-361674011);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1261746189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1261746189L))
            info.setReturnValue("w|%CN\u4DB4NG#\u669Fb(N6usY1L,VJ9G6XJ\u3FAF{pUR-@M+IA\u3855OU0B|^");
    }


}
