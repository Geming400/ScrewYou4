package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.multipart.CombinedCondition.class)
public class CombinedCondition_2082846120Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1174219851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174219851L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1441697652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1441697652L))
            info.setReturnValue("fcgduv\u8AD5.Z7/*8l11\uA9F0sinw\u7E6Fv%Y\u9B00N\u69EA[*ViaT(${\u69BE\u238EZ\u529C)G:n}%HblW'}b*vH^\u747B]XwI\uC39CV?ZmaZTx2{6\uAAAFe/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1654769086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1654769086L))
            info.setReturnValue(-1295448799);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/world/level/block/state/StateDefinition;)Ljava/util/function/Predicate;", cancellable = true)
    private void instantiate_1482091772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1482091772L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "operation()Lnet/minecraft/client/renderer/block/dispatch/multipart/CombinedCondition$Operation;", cancellable = true)
    private void operation__996428259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-996428259L))
            info.setReturnValue(net.minecraft.client.renderer.block.dispatch.multipart.CombinedCondition.Operation.AND);
    }

    @Inject(at = @At("HEAD"), method = "terms()Ljava/util/List;", cancellable = true)
    private void terms_693298142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(693298142L))
            info.setReturnValue(null);
    }


}
