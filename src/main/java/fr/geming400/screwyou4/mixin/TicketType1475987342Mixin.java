package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.TicketType.class)
public class TicketType1475987342Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_567361074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(567361074L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2048556429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2048556429L))
            info.setReturnValue("*_-yiYZEKT#\u8066)qB1)x\u46CF?J\uD3EAyqhk80?bIG\"``P'Q\"%<tMv\uA84AjT+Yx!nWUkxq\u64EAia");
    }

    @Inject(at = @At("HEAD"), method = "flags()I", cancellable = true)
    private void flags__1516983475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1516983475L))
            info.setReturnValue(-1162172761);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2033339433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2033339433L))
            info.setReturnValue(1312267035);
    }

    @Inject(at = @At("HEAD"), method = "timeout()J", cancellable = true)
    private void timeout_1755351156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1755351156L))
            info.setReturnValue(-6871518308292142888L);
    }

    @Inject(at = @At("HEAD"), method = "shouldKeepDimensionActive()Z", cancellable = true)
    private void shouldKeepDimensionActive_1424116913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1424116913L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "doesSimulate()Z", cancellable = true)
    private void doesSimulate__1439421528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1439421528L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canExpireIfUnloaded()Z", cancellable = true)
    private void canExpireIfUnloaded_1547490555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1547490555L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "doesLoad()Z", cancellable = true)
    private void doesLoad_461630886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(461630886L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasTimeout()Z", cancellable = true)
    private void hasTimeout__1384868802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1384868802L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "persist()Z", cancellable = true)
    private void persist__27187215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-27187215L))
            info.setReturnValue(false);
    }


}
