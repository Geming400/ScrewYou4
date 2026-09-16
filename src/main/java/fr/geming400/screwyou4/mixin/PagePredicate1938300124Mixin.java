package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.WritableBookPredicate.PagePredicate.class)
public class PagePredicate1938300124Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1029673856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1029673856L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1586243647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1586243647L))
            info.setReturnValue("XP8\u3D66*9UA,[}Ql<vCK:-`QE_2*\u3B22(\u3475U\u3A0131)@$9<\uBB1F\u4E4D3YUe\uC1C3");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1799315081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1799315081L))
            info.setReturnValue(139782535);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_201328413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(201328413L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/server/network/Filterable;)Z", cancellable = true)
    private void test_108411857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(108411857L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "contents()Ljava/lang/String;", cancellable = true)
    private void contents__615708673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-615708673L))
            info.setReturnValue("++4obo]wQ)_Sr`Z@\uA759nnS;I`\u50D1\"\u7578j^6Ck@J\uFC08)BF\uA8BE,Fu\u13AAai");
    }


}
