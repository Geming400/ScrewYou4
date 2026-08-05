package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.multipart.KeyValueCondition.Terms.class)
public class Terms1074431350Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1835023687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1835023687L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__61029121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-61029121L))
            info.setReturnValue("=\"Q;/#");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1112694092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1112694092L))
            info.setReturnValue(-1557128455);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries__1594199130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1594199130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Ljava/lang/String;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void parse_1013406055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1013406055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Ljava/lang/Object;Lnet/minecraft/world/level/block/state/properties/Property;)Ljava/util/function/Predicate;", cancellable = true)
    private void instantiate_823086462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(823086462L))
            info.setReturnValue(null);
    }


}
