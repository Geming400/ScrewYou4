package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.ArgumentUtils.class)
public class ArgumentUtils_441911610Mixin {
        @Inject(at = @At("HEAD"), method = "createNumberFlags(ZZ)I", cancellable = true)
    private static void createNumberFlags__51584681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-51584681L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeNodeToJson(Lcom/mojang/brigadier/CommandDispatcher;Lcom/mojang/brigadier/tree/CommandNode;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void serializeNodeToJson_1568927632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1568927632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "numberHasMax(B)Z", cancellable = true)
    private static void numberHasMax_1649368026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1649368026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "numberHasMin(B)Z", cancellable = true)
    private static void numberHasMin_1649368026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1649368026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findUsedArgumentTypes(Lcom/mojang/brigadier/tree/CommandNode;)Ljava/util/Set;", cancellable = true)
    private static void findUsedArgumentTypes__449619243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-449619243L))
            info.setReturnValue(null);
    }


}
