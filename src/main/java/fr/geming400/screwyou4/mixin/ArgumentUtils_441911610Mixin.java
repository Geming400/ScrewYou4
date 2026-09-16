package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.ArgumentUtils.class)
public class ArgumentUtils_441911610Mixin {
        @Inject(at = @At("HEAD"), method = "findUsedArgumentTypes(Lcom/mojang/brigadier/tree/CommandNode;)Ljava/util/Set;", cancellable = true)
    private static void findUsedArgumentTypes__856301157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-856301157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeNodeToJson(Lcom/mojang/brigadier/CommandDispatcher;Lcom/mojang/brigadier/tree/CommandNode;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void serializeNodeToJson__2086021301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2086021301L))
            info.setReturnValue(new com.google.gson.JsonObject());
    }

    @Inject(at = @At("HEAD"), method = "createNumberFlags(ZZ)I", cancellable = true)
    private static void createNumberFlags__1065485067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1065485067L))
            info.setReturnValue(1450340448);
    }

    @Inject(at = @At("HEAD"), method = "numberHasMin(B)Z", cancellable = true)
    private static void numberHasMin__1156652773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1156652773L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "numberHasMax(B)Z", cancellable = true)
    private static void numberHasMax__1929131347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1929131347L))
            info.setReturnValue(true);
    }


}
