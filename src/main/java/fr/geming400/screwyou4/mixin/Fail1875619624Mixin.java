package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkResult.Fail.class)
public class Fail1875619624Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_966993356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(966993356L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1648924147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1648924147L))
            info.setReturnValue("EH\u7485[/p27ql\u2EA6h\u1960@]0&Kowe.\uC541dIOCAI(Xz\u1037Y&-\u9851g<JP<g|8JXhkwkNa\u5CA4.Jb6$\uCBEBhhS.9f-A\u37B8(\"[\uD132u\u96252 #W\u526CF\u5AADdm\u24CDVb;/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1861995581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1861995581L))
            info.setReturnValue(-1118949167);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/server/level/ChunkResult;", cancellable = true)
    private void map_459059211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(459059211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "orElse(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void orElse__974392221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-974392221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "orElseThrow(Ljava/util/function/Supplier;)Ljava/lang/Object;", cancellable = true)
    private void orElseThrow_98945765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(98945765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "error()Ljava/util/function/Supplier;", cancellable = true)
    private void error_242250593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(242250593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSuccess()Z", cancellable = true)
    private void isSuccess_409207046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409207046L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "ifSuccess(Ljava/util/function/Consumer;)Lnet/minecraft/server/level/ChunkResult;", cancellable = true)
    private void ifSuccess__543112289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-543112289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getError()Ljava/lang/String;", cancellable = true)
    private void getError_1320779139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1320779139L))
            info.setReturnValue("\uA77EC7)b\u25DFv!E`&`\u27D9r,D'&\u3F0E C:3l@\u9655\u5D3F$");
    }


}
