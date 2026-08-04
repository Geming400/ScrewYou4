package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.CommandSourceStack.class)
public class CommandSourceStack_1707859876Mixin {
        @Inject(at = @At("HEAD"), method = "permissions()Lnet/minecraft/server/permissions/PermissionSet;", cancellable = true)
    private void permissions_635300321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(635300321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__469049290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-469049290L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "callback()Lnet/minecraft/commands/CommandResultCallback;", cancellable = true)
    private void callback_1789065335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1789065335L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levels()Ljava/util/Set;", cancellable = true)
    private void levels__121175611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-121175611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void getLevel__1919569421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1919569421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosition()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getPosition__1489377892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1489377892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAnchor()Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;", cancellable = true)
    private void getAnchor__202955367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-202955367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity__758218967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-758218967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleError(Lcom/mojang/brigadier/exceptions/CommandExceptionType;Lcom/mojang/brigadier/Message;ZLnet/minecraft/commands/execution/TraceCallbacks;)V", cancellable = true)
    private void handleError__1567162480(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1567162480L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dispatcher()Lcom/mojang/brigadier/CommandDispatcher;", cancellable = true)
    private void dispatcher_502810520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(502810520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withLevel(Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withLevel_1384877923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1384877923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSuppressedOutput()Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withSuppressedOutput__577584430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-577584430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withPermission(Lnet/minecraft/server/permissions/PermissionSet;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withPermission_2051490641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2051490641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registryAccess()Lnet/minecraft/core/RegistryAccess;", cancellable = true)
    private void registryAccess_1717336618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1717336618L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getServer()Lnet/minecraft/server/MinecraftServer;", cancellable = true)
    private void getServer_620774297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(620774297L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAllTeams()Ljava/util/Collection;", cancellable = true)
    private void getAllTeams__105788397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-105788397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAvailableSounds()Ljava/util/stream/Stream;", cancellable = true)
    private void getAvailableSounds_1497153560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497153560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOnlinePlayerNames()Ljava/util/Collection;", cancellable = true)
    private void getOnlinePlayerNames__105788397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-105788397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "suggestRegistryElements(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/commands/SharedSuggestionProvider$ElementSuggestionType;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;Lcom/mojang/brigadier/context/CommandContext;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void suggestRegistryElements__1026445593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1026445593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customSuggestion(Lcom/mojang/brigadier/context/CommandContext;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void customSuggestion__776746682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-776746682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendSystemMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void sendSystemMessage__193319062(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-193319062L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withEntity(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withEntity_1881479019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1881479019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSource(Lnet/minecraft/commands/CommandSource;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withSource_1802014958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1802014958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withAnchor(Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withAnchor__1753896247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1753896247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPlayer()Z", cancellable = true)
    private void isPlayer_1746138458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1746138458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withPosition(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withPosition_913154526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(913154526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withRotation(Lnet/minecraft/world/phys/Vec2;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withRotation__56426497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-56426497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSilent()Z", cancellable = true)
    private void isSilent_1746138458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1746138458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayer()Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private void getPlayer_710799392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(710799392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "facing(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void facing_913154526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(913154526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "facing(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void facing__1095562846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1095562846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotation()Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void getRotation__1489407683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1489407683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enabledFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void enabledFeatures__1922286923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1922286923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendChatMessage(Lnet/minecraft/network/chat/OutgoingChatMessage;ZLnet/minecraft/network/chat/ChatType$Bound;)V", cancellable = true)
    private void sendChatMessage__133830813(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-133830813L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldFilterMessageTo(Lnet/minecraft/server/level/ServerPlayer;)Z", cancellable = true)
    private void shouldFilterMessageTo_938301866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(938301866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withMaximumPermission(Lnet/minecraft/server/permissions/PermissionSet;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withMaximumPermission_2051490641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2051490641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSigningContext(Lnet/minecraft/commands/CommandSigningContext;Lnet/minecraft/util/TaskChainer;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withSigningContext_1006056286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1006056286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withCallback(Lnet/minecraft/commands/CommandResultCallback;Ljava/util/function/BinaryOperator;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withCallback__2048640360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2048640360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withCallback(Lnet/minecraft/commands/CommandResultCallback;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void withCallback__1321511257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1321511257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withCallback(Lnet/minecraft/commands/CommandResultCallback;)Lnet/minecraft/commands/ExecutionCommandSource;", cancellable = true)
    private void withCallback__1983032261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1983032261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextName()Ljava/lang/String;", cancellable = true)
    private void getTextName_572399404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(572399404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSigningContext()Lnet/minecraft/commands/CommandSigningContext;", cancellable = true)
    private void getSigningContext__2133527025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133527025L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerOrException()Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private void getPlayerOrException_710799392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(710799392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendSuccess(Ljava/util/function/Supplier;Z)V", cancellable = true)
    private void sendSuccess_1890767692(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1890767692L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendFailure(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void sendFailure__193319062(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-193319062L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChatMessageChainer()Lnet/minecraft/util/TaskChainer;", cancellable = true)
    private void getChatMessageChainer__1911684479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1911684479L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityOrException()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntityOrException__758218967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-758218967L))
            info.setReturnValue(null);
    }


}
